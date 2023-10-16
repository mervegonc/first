package hrms.second.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import hrms.second.entities.concretes.users.JobSeeker;
import hrms.second.entities.dtos.JobSeekerMiniCvDto;

public interface JobSeekerDao extends JpaRepository<JobSeeker, Integer>{

	JobSeeker findByemail(String name);
	JobSeeker findByNationalId(String nationalId);
	
	@Query("Select new project.hmrs.entities.dtos.JobSeekerMiniCvDto(js.id,js.firstName,js.lastName,jsed.degree,jsed.department,jsed.schoolName,jsed.startDate,jsed.endDate,jsexi.nameOfInstution,jsexi.role,jsexi.jobStartDate,jsexi.jobEndDate,jsl.languageName,jsl.languageLevel,jst.knownTechnology,jsw.githubLink,jsw.linkedinLink,jsii.imagePath,jscl.coverLetter) \"\r\n"
			+ "			+ \"From JobSeeker js Inner Join js.jobSeekerEducationInfos jsed Inner Join js.jobSeekerLanguageInfos jsl Inner Join js.jobSeekerImageInfos jsii Inner Join js.jobSeekerExperienceInfos jsexi Inner Join js.jobSeekerTalents jst Inner Join js.jobSeekerWebAddress jsw Inner Join js.jobSeekerCoverLetter jscl")
	List<JobSeekerMiniCvDto> getJobSeekerWithFullCv();
}
