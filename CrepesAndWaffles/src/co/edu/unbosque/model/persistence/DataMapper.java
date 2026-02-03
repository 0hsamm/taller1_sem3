package co.edu.unbosque.model.persistence;

import co.edu.unbosque.model.*;

public class DataMapper {
	
	public static HeladoDTO convertirHeladoAHeladoDTO(Helado entity) {
		HeladoDTO dto = new HeladoDTO();
		dto.setPrecio(entity.getPrecio());
		dto.setSabor(entity.getSabor());
		dto.setCantidadBola(entity.getCantidadBola());
		dto.setEsCono(entity.isEsCono());
		return dto;
	}
	
	public static Helado convertirHeladoDTOAHelado(HeladoDTO dto) {
		Helado entity = new Helado();
		entity.setPrecio(dto.getPrecio());
		entity.setSabor(dto.getSabor());
		entity.setCantidadBola(dto.getCantidadBola());
		entity.setEsCono(dto.isEsCono());
		return entity;
	}
	
	public static CrepeDTO convertirCrepeACrepeDTO(Crepe entity) {
		CrepeDTO dto = new CrepeDTO();
		dto.setPrecio(entity.getPrecio());
		dto.setSabor(entity.getSabor());
		dto.setEsVegano(entity.isEsVegano());
		dto.setEsSalado(entity.isEsSalado());
		return dto;
	}
	
	public static Crepe convertirCrepeDTOACrepe(CrepeDTO dto) {
		Crepe entity = new Crepe();
		entity.setPrecio(dto.getPrecio());
		entity.setSabor(dto.getSabor());
		entity.setEsVegano(dto.isEsVegano());
		entity.setEsSalado(dto.isEsSalado());
		return entity;
	}
}
