package com.marcos.demo.domain.usecase;

import com.iesam.itvavila.demo.data.DemoDataStore;
import com.iesam.itvavila.demo.domain.models.Demo;
import com.marcos.domain.models.Propietario;

public class GuardarPropietarioUseCase {
    private DemoDataStore dataStore = DemoDataStore.getInstance();

    public void execute(Propietario model) {
        dataStore.guardar(model);
    }
}
