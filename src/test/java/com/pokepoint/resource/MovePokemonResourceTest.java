package com.pokepoint.resource;

import com.google.gson.Gson;
import com.pokepoint.PokepointApplicationTests;
import com.pokepoint.domain.dto.MovePokemonNewDTO;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

public class MovePokemonResourceTest extends PokepointApplicationTests {
    private MockMvc mockMvc;
    private Gson gson = new Gson();

    @Autowired
    private MovePokemonResource movePokemonResource;

    @Before
    public void setUp() {
        this.mockMvc = MockMvcBuilders.standaloneSetup(movePokemonResource).build();
    }

    @Test
    public void GETPokemonMove() throws Exception {
        this.mockMvc.perform(MockMvcRequestBuilders.get("/move")).andExpect(MockMvcResultMatchers.status().isOk());
    }

    @Test
    public void GETPokemonMoveId() throws Exception {
        this.mockMvc.perform(MockMvcRequestBuilders.get("/move/1")).andExpect(MockMvcResultMatchers.status().isOk());
    }

    @Test
    public void GETPokemonMoveTypeName() throws Exception {
        this.mockMvc.perform(MockMvcRequestBuilders.get("/move/type?name=Dragon")).andExpect(MockMvcResultMatchers.status().isOk());
    }

    @Test
    public void GETPokemonMoveTypeNameNull() throws Exception {
        this.mockMvc.perform(MockMvcRequestBuilders.get("/move/type")).andExpect(MockMvcResultMatchers.status().isOk());
    }

    @Test
    public void GETPokemonMoveTypeNotFound() throws Exception {
        this.mockMvc.perform(MockMvcRequestBuilders.get("/move/type?name=Teste")).andExpect(MockMvcResultMatchers.status().isOk());
    }

    @Test
    public void POSTPokemonMove() throws Exception {
        this.mockMvc.perform(MockMvcRequestBuilders.post("/move")
                .contentType(MediaType.APPLICATION_JSON)
                .param("englishName", "Draco Meteor")
                .param("japaneseName", "りゅうせいぐん")
                .param("portugueseName", "Meteoro do Dragão")
                .param("accuracy", "90")
                .param("power", "130")
                .param("ppMin", "8")
                .param("ppMax", "5")
                .param("typeId", "4")
        ).andExpect(MockMvcResultMatchers.status().isCreated());
    }
}
