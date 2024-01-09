package com.thinkitive.task1.service;

import com.thinkitive.task1.entity.EligibilityRequest;
import org.springframework.stereotype.Service;

import java.lang.reflect.Field;

@Service
public class _270_Service {

    public String get270Format(EligibilityRequest eligibilityRequest) {
        StringBuilder sb = new StringBuilder();

        sb.append(String.format("ISA*00*          *00*          *ZZ*%s       *ZZ*%s      *%s*0857*  *00501*001071054*0*P*^~\n",
                eligibilityRequest.getProviderName(), eligibilityRequest.getPayerEdiCode(), "231226"));

        sb.append(String.format("GS*HS*%s*%s*%s*0857*1071048*X*005010X279A1~\n",
                eligibilityRequest.getProviderName(), eligibilityRequest.getPayerEdiCode(), "20231226"));

        sb.append("ST*270*0001*005010X279A1~\n");

        sb.append(String.format("BHT*0022*13*%s*085709~\n", "1071046"));

        sb.append("HL*1**20*1~\n");
        sb.append(String.format("NM1*PR*2*%s*****PI*%s~\n", eligibilityRequest.getProviderName(), eligibilityRequest.getProviderNpi()));

        sb.append("HL*2*1*21*1~\n");
        sb.append(String.format("NM1*1P*1*%s****XX*%s~\n", eligibilityRequest.getPayerName(), eligibilityRequest.getPayerEdiCode()));

        sb.append("HL*3*2*22*0~\n");
        sb.append(String.format("TRN*1*%s*9%s~\n", "218559495", eligibilityRequest.getPatientMemberId()));
        sb.append(String.format("NM1*IL**%s*%s****MI*%s~\n", eligibilityRequest.getPatientLastName(), eligibilityRequest.getPatientFirstName(), eligibilityRequest.getPatientMemberId()));
        String dobWithoutSlashes = eligibilityRequest.getPatientDob().replace("/", "");
        sb.append(String.format("DMG*D8*%s~\n", dobWithoutSlashes));
        sb.append(String.format("EQ*%s~\n", eligibilityRequest.getPatientRelationship()));

        sb.append("SE*12*0001~\n");
        sb.append("GE*1*1071048~\n");

        sb.append("IEA*1*001071054~\n");

        return sb.toString();
    }

    public String getNM1Format(EligibilityRequest eligibilityRequest) {
        String dataString = "NM1*<Entity Identifier Code ,ex- PR - Payer>*<Entity Type Qualifier ,ex- 2 – Non-Person Entity>*<Information Source Last or Organization Name Children’s Special Health Care>*<Information Source First Name>*<Information Source Middle Name>*<Name Prefix>*<Information Source Name Suffix>*<Identification Code Qualifier FI – Federal Tax Payer Identification Number>*<Information Source Primary Identifier 356000158>*<Entity Relationship Code>*<Entity Identifier Code>~";

        for (Field field : EligibilityRequest.class.getDeclaredFields()) {
            field.setAccessible(true);
            String fieldName = field.getName();
            String placeholder = "<" + fieldName + ">";
            try {
                Object value = field.get(eligibilityRequest);
                String replacement = (value != null) ? value.toString() : "";

                dataString = dataString.replace(placeholder, replacement);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }

        dataString = dataString.replaceAll(",ex-[^>]*>", "");
        dataString = dataString.replaceAll("\\*\\*", "*");

        return dataString;
    }

}
