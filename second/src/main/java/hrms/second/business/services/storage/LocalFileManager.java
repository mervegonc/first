package hrms.second.business.services.storage;

import java.io.IOException;
import java.io.File;
import org.springframework.web.multipart.MultipartFile;
import java.nio.file.Path;
import hrms.second.entities.concretes.cvInformations.enums.StorageType;

public class LocalFileManager implements FileService{

	@Override
	public String uploadFile(MultipartFile file) throws IOException {
		
		File convFile = new File("src/main/resources/temporaryFolder/"+file.getOriginalFilename());
		String path = convFile.getAbsolutePath();
		file.transferTo(Path.of(convFile.getAbsolutePath()));
		
		return path;
	}

	@Override
	public StorageType getFileStorageName() {
		
		return StorageType.Local;
	}

}
