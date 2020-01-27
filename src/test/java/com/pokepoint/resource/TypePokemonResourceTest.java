package com.pokepoint.resource;

import com.google.gson.Gson;
import com.pokepoint.PokepointApplicationTests;
import com.pokepoint.domain.TypePokemon;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

public class TypePokemonResourceTest extends PokepointApplicationTests {
    private MockMvc mockMvc;

    @Autowired
    private TypePokemonResource typePokemonResource;

    @Before
    public void setUp() {
        this.mockMvc = MockMvcBuilders.standaloneSetup(typePokemonResource).build();
    }

    @Test
    public void GETPokemonTypeTest() throws Exception {
        this.mockMvc.perform(MockMvcRequestBuilders.get("/type")).andExpect(MockMvcResultMatchers.status().isOk());
    }

    @Test
    public void GETPokemonTypeNameTest() throws Exception {
        this.mockMvc.perform(MockMvcRequestBuilders.get("/type/Normal")).andExpect(MockMvcResultMatchers.status().isOk());
    }

    @Test
    public void GETPokemonTypeIdTest() throws Exception {
        this.mockMvc.perform(MockMvcRequestBuilders.get("/type/1")).andExpect(MockMvcResultMatchers.status().isOk());
    }

    @Test
    public void POSTPokemonTypeTest() throws Exception {
        TypePokemon fairy = new TypePokemon(null, "Fairy", "フェアリータイプ", "Fada");
        Gson gson = new Gson();
        String json = gson.toJson(fairy);
        this.mockMvc.perform(MockMvcRequestBuilders.post("/type").contentType(MediaType.APPLICATION_JSON).content(json)).andExpect(MockMvcResultMatchers.status().isCreated());
    }

    @Test
    public void DELETEPokemonTypeErrorTest() throws Exception {
        this.mockMvc.perform(MockMvcRequestBuilders.delete("/type/",1)
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isBadRequest());
    }
}