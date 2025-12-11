package labubu.popmart.labublog;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/labublog")

public class LabubuController {

    private final JdbcTemplate jdbcTemplate;

    public LabubuController(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @PostMapping("/salvar")
    public void salvarLabubu(@RequestBody Labubu labubu) {

        jdbcTemplate.update("insert into labubu (nome, senha) values (?, ?)",
                labubu.getNome(), labubu.getSenha());

    }

}
