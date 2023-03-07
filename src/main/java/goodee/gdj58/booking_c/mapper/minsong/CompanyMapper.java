package goodee.gdj58.booking_c.mapper.minsong;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import goodee.gdj58.booking_c.vo.CompanyDetail;
import goodee.gdj58.booking_c.vo.CompanyOffday;
import goodee.gdj58.booking_c.vo.CompanyType;

@Mapper
public interface CompanyMapper {
	int insertCompanyOffday(CompanyOffday companyOffday);
	List<CompanyOffday> selectCompanyOffdayList(String companyId);
	String selectCompanyTypeContent(int companyTypeNo);
	List<CompanyType> selectCompanyTypeList();
	int insertCompanyDetail(CompanyDetail companyDetail);
}
