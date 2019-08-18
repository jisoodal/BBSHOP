package com.bbshop.bit.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.bbshop.bit.domain.Cart_GDVO;
import com.bbshop.bit.domain.Gd_BallVO;
import com.bbshop.bit.domain.Gd_BatVO;
import com.bbshop.bit.domain.Gd_GloveVO;
import com.bbshop.bit.domain.Gd_ShoesVO;
import com.bbshop.bit.domain.Gd_UniformVO;
import com.bbshop.bit.domain.OrderVO;
import com.bbshop.bit.domain.Order_GDVO;

public interface OrderService {
	
	// 지수 카트
	
	public List<Cart_GDVO> getCheckedCartList(String[] goods_num_list);
	
	public Gd_GloveVO getOptionListGlove(long gd_details);
	
	public Gd_BatVO getOptionListBat(long gd_details);
	
	public Gd_UniformVO getOptionListUniform(long gd_details);
	
	public Gd_ShoesVO getOptionListShoes(long gd_details);
	
	public Gd_BallVO getOptionListBall(long gd_details);
	
	public int insertOrder(OrderVO order);
	
	public long getLastOrderNum(long user_key);
	
	public OrderVO getOrderList(long order_num);
	
	public int updateGloveStock(int qntty, long glove_num);
	
	public int updateBatStock(int qntty, long bat_num);
	
	public int updateUniformStock(int qntty, long uniform_num);
	
	public int updateShoesStock(int qntty, long shoes_num);
	
	public int updateBallStock(int qntty, long ball_num);
	
	public int deleteOrder(long order_num);
	
	public int updateTid(String tid, long order_num);
	
	public int insertOrderGD(Order_GDVO order_gd);
	
	// 의정 단일상품

//	public GoodsVO getGoodsInfo(Long goods_num);

	public Gd_GloveVO getGloveOption(long goods_num, int hand, int taming);
	
	public Gd_BatVO getBatOption(long goods_num, int gd_size);
	
	public Gd_UniformVO getUniformOption(long goods_num, int gd_size);
	
	public Gd_ShoesVO getShoesOption(long goods_num, int spike, int gd_size);
	
	public Gd_BallVO getBallOption(long goods_num, int sales_unit);
}
