package org.inf;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EnderecoTest {

    @Test
    public void testEnderecoBuilder() {
        Endereco endereco = new EnderecoBuilder()
                .setRua("Rua A")
                .setSetor("Setor B")
                .setCep("12345-678")
                .setNumero("123")
                .setCidade("Cidade X")
                .setEstado("Estado Y")
                .setBloco("Bloco Z")
                .setQuadra("Quadra W")
                .build();

        assertEquals("Rua A", endereco.getRua());
        assertEquals("Setor B", endereco.getSetor());
        assertEquals("12345-678", endereco.getCep());
        assertEquals("123", endereco.getNumero());
        assertEquals("Cidade X", endereco.getCidade());
        assertEquals("Estado Y", endereco.getEstado());
        assertEquals("Bloco Z", endereco.getBloco());
        assertEquals("Quadra W", endereco.getQuadra());
    }
}