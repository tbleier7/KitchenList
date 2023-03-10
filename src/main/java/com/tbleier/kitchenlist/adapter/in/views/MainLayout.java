package com.tbleier.kitchenlist.adapter.in.views;

import com.tbleier.kitchenlist.adapter.in.views.artikel.ArtikelListView;
import com.tbleier.kitchenlist.adapter.in.views.einkaufsliste.EinkaufslisteListView;
import com.tbleier.kitchenlist.adapter.in.views.kategorie.KategorieListView;
import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.component.applayout.DrawerToggle;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.HighlightConditions;
import com.vaadin.flow.router.RouterLink;

public class MainLayout extends AppLayout {

    public MainLayout() {
        createHeader();
        createDrawer();
    }

    private void createHeader() {
        H1 logo = new H1("Kitchenlist");
        logo.addClassNames("text-l","m-m");

        HorizontalLayout header = new HorizontalLayout(new DrawerToggle(), logo);

        header.setDefaultVerticalComponentAlignment(FlexComponent.Alignment.CENTER);
        header.expand(logo);
        header.setWidthFull();
        header.addClassNames("py-0", "px-m");

        addToNavbar(header);
    }

    private void createDrawer() {
        RouterLink artikelListView = new RouterLink("Artikel", ArtikelListView.class);
        artikelListView.setHighlightCondition(HighlightConditions.sameLocation());

        RouterLink kategorieListView = new RouterLink("Kategorien", KategorieListView.class);
        kategorieListView.setHighlightCondition(HighlightConditions.sameLocation());

        RouterLink einkaufsListeListView = new RouterLink("Einkaufsliste", EinkaufslisteListView.class);
        kategorieListView.setHighlightCondition(HighlightConditions.sameLocation());

        addToDrawer(new VerticalLayout(
                artikelListView,
                kategorieListView,
                einkaufsListeListView
        ));
    }


}
