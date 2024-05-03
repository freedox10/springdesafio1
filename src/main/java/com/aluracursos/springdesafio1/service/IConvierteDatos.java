package com.aluracursos.springdesafio1.service;

public interface IConvierteDatos {
    <T> T  obtenerDatos(String json, Class<T> clase);
}
