package com.itschool.library.integration_tests;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.itschool.library.models.dtos.RequestBookDTO;
import jakarta.transaction.Transactional;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@Slf4j
@ExtendWith(SpringExtension.class)
@SpringBootTest
@AutoConfigureMockMvc
@Transactional
@AutoConfigureTestDatabase
class BookControllerTest {

    @Autowired
    private MockMvc mockMvc;
    @Autowired
    private ObjectMapper objectMapper;

    @Test
    void testCreateBookShouldPass() throws Exception {
        RequestBookDTO requestBookDTO = new RequestBookDTO();
        requestBookDTO.setTitle("test title");
        requestBookDTO.setAuthor("test author");
        requestBookDTO.setIsbn("test isbn");
        requestBookDTO.setGenre("test genre");

        mockMvc.perform(post("/api/books")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(requestBookDTO)))
                .andExpect(status().isOk());
    }
}