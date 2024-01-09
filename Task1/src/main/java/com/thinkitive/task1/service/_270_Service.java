package com.thinkitive.task1.service;

import com.thinkitive.task1.entity.EligibilityRequest;
import org.springframework.stereotype.Service;

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
}
