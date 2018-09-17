package cap.controller;


import cap.service.AdminService;
import cap.model.Admin;
import cap.util.PageBean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@@ -37,5 +38,15 @@ public String del(@RequestParam(value = "id") Integer id) {

        }

@RequestMapping(value = "/lists", method = RequestMethod.GET)
public ModelAndView findByPage(
@RequestParam(value = "pageNo", required = true, defaultValue = "1") Integer pageNo) {
        ModelAndView mv = new ModelAndView();
        PageBean pageBean = adminService.findByPage(pageNo, 5);
        mv.addObject("pageBean", pageBean);
        mv.setViewName("lists");
        return mv;
        }

        }