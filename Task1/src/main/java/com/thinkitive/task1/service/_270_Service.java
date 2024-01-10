package com.thinkitive.task1.service;

import com.thinkitive.task1.entity.EligibilityRequest;
import org.springframework.stereotype.Service;


@Service
public class _270_Service {

    public String get270Format(EligibilityRequest eligibilityRequest) {
        String template = "ISA*00*          *00*          *ZZ*<?senderID>       *ZZ*<?receiverID>      *231226*0857**00501*001071054*0*P*^~\n" +
                "GS*HS*<?senderID>*<?receiverID>*20231226*0857*1071048*X*005010X279A1~\n" +
                "ST*270*0001*005010X279A1~\n" +
                "BHT*0022*13*<?transactionControlNumber?>*20231226*085709~\n" +
                "HL*1**20*1~\n" +
                "NM1*PR*2*<?payerName?>*****PI*<?payerEdiCode?>~\n" +
                "HL*2*1*21*1~\n" +
                "NM1*1P*1*<?providerName?>*****XX*<?providerNpi?>~\n" +
                "HL*3*2*22*0~\n" +
                "TRN*1*<?transactionControlNumber?>*<?patientMemberId?>~\n" +
                "NM1*IL**<?patientLastName?>*<?patientFirstName?>****MI*<?patientMemberId?>~\n" +
                "DMG*D8*<?patientDob?>~\n" +
                "EQ*12~\n" +
                "SE*12*0001~\n" +
                "GE*1*1071048~\n" +
                "IEA*1*001071054~";

        String result = template.replace("<?senderID>", getValueOrDefault(eligibilityRequest.getSenderId()))
                .replace("<?receiverID>", getValueOrDefault(eligibilityRequest.getReceiverId()))
                .replace("<?transactionControlNumber?>", getValueOrDefault(eligibilityRequest.getTransactionControlNumber()))
                .replace("<?payerName?>", getValueOrDefault(eligibilityRequest.getPayerName()))
                .replace("<?payerEdiCode?>", getValueOrDefault(eligibilityRequest.getPayerEdiCode()))
                .replace("<?providerName?>", getValueOrDefault(eligibilityRequest.getProviderName()))
                .replace("<?providerNpi?>", getValueOrDefault(eligibilityRequest.getProviderNpi()))
                .replace("<?patientMemberId?>", getValueOrDefault(eligibilityRequest.getPatientMemberId()))
                .replace("<?patientLastName?>", getValueOrDefault(eligibilityRequest.getPatientLastName()))
                .replace("<?patientFirstName?>", getValueOrDefault(eligibilityRequest.getPatientFirstName()))
                .replace("<?patientDob?>", getValueOrDefault(eligibilityRequest.getPatientDob()));

        return result;
    }
    private String getValueOrDefault(String value) {
        return value != null ? value : "<?>";
    }
}
