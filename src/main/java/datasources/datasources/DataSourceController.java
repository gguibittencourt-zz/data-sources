package datasources.datasources;

import com.google.gson.Gson;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/data-sources")
public class DataSourceController {

    private static final Gson GSON = new Gson();

    @GetMapping("/")
    public ResponseEntity<String> list() {
        boolean random = Math.random() < 0.5;
        return ResponseEntity.ok(GSON.toJson("{\"dados\": {\"possuiPlanoProjeto\": " + random + "}}"));
    }

    @GetMapping("/questao1")
    public ResponseEntity<String> questao1() {
        Double random = (Double) Math.random();
        return ResponseEntity.ok(GSON.toJson("{\"dados\": {\"questao1\": " + random.intValue() + ", \"texto\": \"2\"}}"));
    }

    @GetMapping("/questao2")
    public ResponseEntity<String> questao2() {
        return ResponseEntity.ok(GSON.toJson("{\"dados\": {\"questao2\": \"2\"}}"));
    }
}
