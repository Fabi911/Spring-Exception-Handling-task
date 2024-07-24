package de.neuefische.springexceptionhandlingtask;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class ControllerIntegrationTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void getAllAnimals_whenNoAnimalsFound_shouldReturnNotFoundStatus() throws Exception {
        mockMvc.perform(get("/api/animals"))
                .andExpect(status().isNotFound());
    }

    @Test
    public void getAllCars_whenNoCarsFound_shouldReturnNotFoundStatus() throws Exception {
        mockMvc.perform(get("/api/cars"))
                .andExpect(status().isNotFound());
    }
}