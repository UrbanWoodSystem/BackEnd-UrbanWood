package br.sc.senac.urbanwood.mapper;

import org.springframework.stereotype.Service;

import br.sc.senac.urbanwood.model.Image;
import br.sc.senac.urbanwood.model.Order;

@Service
public class ImageMapper {
	
	public ImageDTO toDTO(Image image) {
        return new ImageDTO(image.getId(), image.getName(), image.getCode() );
    }

    public Image toEntity(ImageDTO dto) {
        return new Image(dto.id(), dto.name(), dto.code());
    }

}
