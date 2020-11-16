package com.ipartek.modelo;

import com.ipartek.pojo.Persona;

public interface IPersona extends IDao<Persona> {

	Persona recuperarPorDni(String dni);

}
