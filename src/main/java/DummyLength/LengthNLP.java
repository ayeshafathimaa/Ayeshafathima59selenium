
package DummyLength;

import com.tyss.optimize.common.util.*;
import com.tyss.optimize.nlp.util.*;
import com.tyss.optimize.nlp.util.annotation.*;
import java.util.*;

import org.springframework.stereotype.Component;

@Component("LIC16519_PJT1010_PE_NLP00c79093-348f-427b-ad4d-b1f54a486b98")
public class LengthNLP implements Nlp {
    @InputParams({@InputParam(name = "String", type = "java.lang.String")})
    @ReturnType(name = "Lengthofthestring", type = "java.lang.Integer")
     

      public NlpResponseModel execute(NlpRequestModel nlpRequestModel) throws NlpException {
        
          NlpResponseModel nlpResponseModel = new NlpResponseModel();
          Map<String, Object> programElementsInput = nlpRequestModel.getAttributes();
          String Str = (String) programElementsInput.get("String");
          
          int returnValue=0;

          try {
           // Your program element business logic starts here ...
              returnValue=Str.length();
              nlpResponseModel.setMessage("Length of the string");
              nlpResponseModel.setStatus(CommonConstants.pass);
              }
          catch(Exception e) {
           // Your program element Exception goes here ...
              nlpResponseModel.setMessage("Failed to Fetch Length");
              nlpResponseModel.setStatus(CommonConstants.fail);
              }

          // Your program element business logic ends here ...
          nlpResponseModel.getAttributes().put("Sum of Letters", returnValue);
          return nlpResponseModel;
      }

      @Override
      public List<String> getTestParameters() throws NlpException {
        List<String> params = new ArrayList<>();
        return params;
      }

      @Override
      public StringBuilder getTestCode() throws NlpException {
         StringBuilder sb = new StringBuilder();
        return sb;
      }
  } 