package org.example;

import org.example.ioc.adapter.InitAdapterGeneratorCommand;
import org.example.ioc.scope_based.InitScopeBasedIoCImplCommand;
import org.example.command.operations.Fuelable;
import org.example.command.operations.move.Movable;
import org.example.command.operations.Rotatable;
import org.junit.jupiter.api.BeforeAll;

public class IoCAbstractTest {
    @BeforeAll
    static void init() {
        new InitScopeBasedIoCImplCommand().execute();
        new InitAdapterGeneratorCommand(Movable.class).execute();
        new InitAdapterGeneratorCommand(Rotatable.class).execute();
        new InitAdapterGeneratorCommand(Fuelable.class).execute();
    }
}
