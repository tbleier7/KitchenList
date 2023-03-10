package com.tbleier.kitchenlist.adapter.out.persistence.kategorie;

import com.tbleier.kitchenlist.adapter.out.persistence.artikel.ArtikelJpaMapper;
import com.tbleier.kitchenlist.application.domain.Kategorie;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface KategorieJpaMapper {
    KategorieJpaMapper INSTANCE = Mappers.getMapper(KategorieJpaMapper.class );

    KategorieJpaEntity kategorieToJpaEntity(Kategorie kategorie);

    Kategorie jpaEntityToKategorie(KategorieJpaEntity jpaEntity);

    List<Kategorie> jpaEntityToKategorie(List<KategorieJpaEntity> jpaEntity);
}
