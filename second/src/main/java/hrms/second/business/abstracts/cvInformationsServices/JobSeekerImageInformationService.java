package hrms.second.business.abstracts.cvInformationsServices;



import org.springframework.web.multipart.MultipartFile;

import hrms.second.core.utilites.results.Result;


public interface JobSeekerImageInformationService {
	
	Result add(MultipartFile file, int jobSeekerId);
}
