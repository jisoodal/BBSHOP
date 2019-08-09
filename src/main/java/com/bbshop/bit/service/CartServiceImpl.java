package com.bbshop.bit.service;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bbshop.bit.cart.domain.Cart_PDVO;
import com.bbshop.bit.cart.domain.GoodsVO;
import com.bbshop.bit.cart.mapper.CartMapper;

@Service("cartService")
public class CartServiceImpl implements CartService {

	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public List<Cart_PDVO> getCartList(long user_key) {
		
		System.out.println("����Ű�� ������� �����°�?"+user_key);
		CartMapper mapper = sqlSession.getMapper(CartMapper.class);
		sqlSession.getMapper(CartMapper.class);
		List<Cart_PDVO> cartList = mapper.getCartList(user_key);
		
		System.out.println(cartList);
		
		// TODO Auto-generated method stub
		return cartList;
	}
	@Override
	public GoodsVO getGoods(long goodsnum){
		System.out.println("GoodsNum�� �����°�?"+goodsnum);
		
		CartMapper mapper = sqlSession.getMapper(CartMapper.class);
		sqlSession.getMapper(CartMapper.class);
		
		GoodsVO goods = mapper.getGoods(goodsnum);
		System.out.println(goods);
		
		return goods;
		
	}
	
	@Override
	public void modify(Cart_PDVO qnt) {
		CartMapper mapper = sqlSession.getMapper(CartMapper.class);
		sqlSession.getMapper(CartMapper.class);
		mapper.modify(qnt);
		System.out.println("�����Ǿ����ϴ�.");
	}
	@Override
	public void selectDelete(Map<String,Object> deleteMap) {
		CartMapper mapper = sqlSession.getMapper(CartMapper.class);
		sqlSession.getMapper(CartMapper.class);
		mapper.selectDelete(deleteMap);
		System.out.println("���� �Ǿ����ϴ�.");
		
	}
	@Override
	public void deleteAll() {
		CartMapper mapper = sqlSession.getMapper(CartMapper.class);
		sqlSession.getMapper(CartMapper.class);
		mapper.deleteAll();
		System.out.println("��ü���� �Ǿ����ϴ�.");
	}

}