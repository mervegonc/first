package hrms.second.business.services.storage;

import java.io.IOException;

import org.springframework.web.multipart.MultipartFile;

import hrms.second.entities.concretes.cvInformations.enums.StorageType;

public interface FileService {
	String uploadFile(MultipartFile file) throws IOException;
	StorageType getFileStorageName();
}
