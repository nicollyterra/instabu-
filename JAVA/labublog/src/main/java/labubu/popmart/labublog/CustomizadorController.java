package labubu.popmart.labublog;


import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RequestMapping("/labublog/customizador")
@RestController

public class CustomizadorController {

    private final JdbcTemplate jdbcTemplate;

    public CustomizadorController(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @PutMapping("/trocarRoupa/{idLabubu}")
    public void trocarRoupa(@RequestBody List<Integer> IDs, @PathVariable Integer idLabubu) {

        String update_query = "id_foto = " + IDs.getFirst();

        for (int i = 1; i < IDs.size(); i++) {
            update_query += " or id_foto = " + IDs.get(i);
        }

        System.out.println("QUERY UPDATE");
        System.out.println(update_query);

        jdbcTemplate.update("update roupaDoLabubu as rl join roupa as r on r.idRoupa = rl.idRoupa set vestindo = ("+ update_query +") where idLabubu = ?;",
                idLabubu);

    }

}
