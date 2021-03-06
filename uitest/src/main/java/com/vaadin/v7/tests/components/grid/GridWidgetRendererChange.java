package com.vaadin.v7.tests.components.grid;

import com.vaadin.annotations.Widgetset;
import com.vaadin.server.VaadinRequest;
import com.vaadin.tests.widgetset.TestingWidgetSet;
import com.vaadin.tests.widgetset.client.v7.grid.GridRendererChangeWidget;
import com.vaadin.tests.widgetset.server.TestWidgetComponent;
import com.vaadin.ui.UI;

@Widgetset(TestingWidgetSet.NAME)
public class GridWidgetRendererChange extends UI {

    @Override
    protected void init(VaadinRequest request) {
        setContent(new TestWidgetComponent(GridRendererChangeWidget.class));
    }

}
