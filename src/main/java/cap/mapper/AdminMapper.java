package cap.mapper;

import cap.model.Admin;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@@ -16,4 +17,8 @@
        int updateAdmin(Admin admin);

        int deleteAdmin(Integer id);

        List<Admin> findByPage(@Param(value = "start") int start, @Param(value = "pageSize") int pageSize);

        int getTotalCount();
        }