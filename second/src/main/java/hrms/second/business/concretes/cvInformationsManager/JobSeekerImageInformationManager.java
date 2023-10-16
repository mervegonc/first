package hrms.second.business.concretes.cvInformationsManager;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import hrms.second.entities.concretes.cvInformations.JobSeekerImageInformation;
import hrms.second.business.abstracts.cvInformationsServices.JobSeekerImageInformationService;
import hrms.second.business.services.storage.FileOperations;
import hrms.second.business.services.storage.FileService;
import hrms.second.core.utilites.results.Result;
import hrms.second.core.utilites.results.ResultSuccess;
import hrms.second.dataAccess.abstracts.JobSeekerDao;
import hrms.second.dataAccess.abstracts.cvInformationsDaos.JobSeekerImageInformationDao;


@Service
public class JobSeekerImageInformationManager implements JobSeekerImageInformationService{

	private JobSeekerImageInformationDao  jobSeekerImageInformationDao;
	private FileService fileService;
	private JobSeekerDao jobSeekerDao;
	
	@Autowired
	public JobSeekerImageInformationManager(JobSeekerImageInformationDao  jobSeekerImageInformationDao,FileService fileService,JobSeekerDao jobSeekerDao) {
		this.jobSeekerImageInformationDao = jobSeekerImageInformationDao;
		this.fileService = fileService;
		this.jobSeekerDao = jobSeekerDao;
	}

	@Override
	public Result add(MultipartFile file, int jobSeekerId) {
		JobSeekerImageInformation  jobSeekerImageInformation = new JobSeekerImageInformation();
		/*
		 * try { String filePath= fileService.uploadFile(file);
		 * jobSeekerImageInformation.setJobSeeker(jobSeekerDao.findById(jobSeekerId).
		 * orElseThrow());
		 * jobSeekerImageInformation.setImageName(FileOperations.getFileName(file));
		 * jobSeekerImageInformation.setStorageName(fileService.getFileStorageName());
		 * jobSeekerImageInformation.setImagePath(filePath); }catch(IOException e) {
		 * throw new RuntimeException(); }
		 */
		
		jobSeekerImageInformationDao.save(jobSeekerImageInformation);
		return new ResultSuccess("Your profile picture has been successfully saved");
	}
}

