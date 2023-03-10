package com.tbleier.kitchenlist.adapter.in.views.artikel;

import com.tbleier.kitchenlist.application.domain.Artikel;
import com.tbleier.kitchenlist.application.domain.Einheit;
import com.tbleier.kitchenlist.application.domain.Kategorie;
import com.tbleier.kitchenlist.application.ports.ArtikelDTO;
import org.checkerframework.checker.units.qual.K;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
class ArtikelDTOMapperTest {
    
    private ArtikelDTOMapper testee;
    
    @BeforeEach
    public void setUp() {
        testee = ArtikelDTOMapper.INSTANCE;
    }

    @Test
    public void should_map_artikel() {
        //Arrange
        var expectedModel = new ArtikelDTO(2, "Zwiebeln", Einheit.Stueck, "Gemüse");
        Artikel artikel = new Artikel(2, "Zwiebeln", Einheit.Stueck, new Kategorie(6, "Gemüse"));

        //Act
        var actual = testee.artikelToModel(artikel);

        //Assert
        assertEquals(expectedModel, actual);
    }
}