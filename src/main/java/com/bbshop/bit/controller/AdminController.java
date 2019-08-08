package com.bbshop.bit.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bbshop.bit.domain.Gd_gloveVO;
import com.bbshop.bit.domain.GoodsVO;
import com.bbshop.bit.service.AdminService;



@Controller
@RequestMapping("*.do")
public class AdminController {
	
	@Autowired(required=false)
	AdminService adminService;
	
	@RequestMapping("admin_main.do")
	public String admin_main() {
		return "shoppingMall/admin/admin_main";
	}
	
	@RequestMapping("userlist.do")
	public String userList() {
		return "shoppingMall/admin/userlist";
	}

	@RequestMapping("withdrawal.do")
	public String withdrawal() {
		return "shoppingMall/admin/withdrawal";
	}

	@RequestMapping("goodsList.do")
	public String goodsList(Model model) {
		System.out.println("상품관리 페이지 입니다.");
		List<GoodsVO> goodsList = adminService.getGoodsList();
		//상품의 옵션별로 받아올 리스트이다.
		List<Object> detailList = new ArrayList<Object>();
		for(int i=0; i<goodsList.size();i++) {
			//대표 상품 하나에 옵션들을 받아오는 리스트이다. 카테고리와 굿즈넘버를 넘겨줘서 그걸로 1개의 상품의 옵션을 다담아오는 리스트를 만듬.
			List<Object> tempList = adminService.getGdList(goodsList.get(i).getCATEGORY(),goodsList.get(i).getGOODS_NUM());
			//그 리스트들을 다시 한 리스트에 addAll하여서 전체의 옵션 리스트를 하나 만들어준다.
			detailList.addAll(tempList);
		}
		//전체 옵션리스트 확인.
		for(int i = 0 ; i<detailList.size();i++) {
		System.out.println("detailList"+i+":"+detailList.get(i));
		}
		model.addAttribute("detailList",detailList);
		model.addAttribute("goodsList",goodsList);
		
				
		return "shoppingMall/admin/goodsList";
	}

	@RequestMapping("order.do")
	public String order() {
		return "shoppingMall/admin/order";
	}

	

	@RequestMapping("refund.do")
	public String refund() {
		return "shoppingMall/admin/refund";
	}

	@RequestMapping("review.do")
	public String admin_review() {
		return "shoppingMall/admin/review";
	}

	@RequestMapping("service_FAQ.do")
	public String service_FAQ() {
		return "shoppingMall/admin/service_FAQ";
	}
	@RequestMapping("service_OneToOne.do")
	public String onetoone() {
		return "shoppingMall/admin/service_OneToOne";
	}

	@RequestMapping("service_QNA.do")
	public String QNA() {
		return "shoppingMall/admin/service_QNA";
	}

	@RequestMapping("community_Notice.do")
	public String community_Notice() {
		return "shoppingMall/admin/community_Notice";
	}


	@RequestMapping("report.do")
	public String report() {
		return "shoppingMall/admin/report";
	}

	@RequestMapping("adminAccount.do")
	public String adminAccount() {
		return "shoppingMall/admin/adminAccount";
	}

	
	
	
}
