package default_package;

import com.tyss.optimize.common.util.*;
import com.tyss.optimize.nlp.util.*;
import com.tyss.optimize.nlp.util.annotation.*;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.InputStream;
import java.util.*;

import javax.imageio.ImageIO;

import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.springframework.stereotype.Component;

@Component("LIC19437_PJT1002_PE_NLP0cce6a21-2c5b-479d-9798-fbc7b2551fb2")
public class clickonelement implements Nlp {
    @InputParams({@InputParam(name = "Element", type = "java.io.InputStream") })
   // @ReturnType(name = "Sum of Two numbers", type = "java.lang.Integer")
    

      public NlpResponseModel execute(NlpRequestModel nlpRequestModel) throws NlpException {
        
          NlpResponseModel nlpResponseModel = new NlpResponseModel();
          Map<String, Object> programElementsInput = nlpRequestModel.getAttributes();
          InputStream elem = (InputStream) programElementsInput.get("Element");
          //Integer num2 = (Integer) programElementsInput.get("Number 2");
          //int returnValue=0;

          try {
           // Your program element business logic starts here ...
        	  BufferedImage buff = ImageIO.read(elem);
        	  
        	  Pattern p = new Pattern(buff);
        	  Screen sc = new Screen();
        	  sc.click(p);
              nlpResponseModel.setMessage("click on image is passed");
              nlpResponseModel.setStatus(CommonConstants.pass);
              }
          catch(Exception e) {
           // Your program element Exception goes here ...
              nlpResponseModel.setMessage("click on image  Failed ");
              nlpResponseModel.setStatus(CommonConstants.fail);
              }

          // Your program element business logic ends here ...
          //nlpResponseModel.getAttributes().put("Sum of Two numbers", returnValue);
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