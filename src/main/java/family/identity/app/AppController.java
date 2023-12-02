package family.identity.app;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@OpenAPIDefinition
public class AppController {
    @Autowired
    AppService appService;
    @GetMapping("/greeting")
    public String index() {
        return "Hello, World!";
    }
    @PostMapping("/getFamilyMemberNumber")
    public ResponseEntity<String> getFamilyMemberNumber(@RequestParam Integer familyMemberNumber) {
        String result = "We have " + familyMemberNumber + " family members.";
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
    @PostMapping("/getFamilyMemberName")
    public ResponseEntity<String> getFamilyMemberName(@RequestParam Integer age) {
        String name = appService.getNameFromAge(age);
        return new ResponseEntity<>(name, HttpStatus.OK);
    }
}
