package com.bbshop.bit.service;

import java.util.List;

import com.bbshop.bit.domain.GoodsQnaVO;
import com.bbshop.bit.domain.GoodsVO;
import com.bbshop.bit.domain.MoreDetailsVO;
import com.bbshop.bit.domain.PagingVO;

public interface GoodsService {
	
	// ī�װ� int > String
	public String category(int category);
	
	/* ����¡ O, ��ǰ ��� */
	public List<GoodsVO> getGoodsList(int category, PagingVO pagingVO, String sorting, String min_amount, String max_amount, 
			List<String> positions, List<String> colors_list, List<String> brands);

	/* ī�װ���  goods ������ ���� */
	public int getTotalCount(int category);
	
	/* ajax�� ������ �ҷ��� �� ��ü ���� ���ϱ� */
	public int getTotalCountAjax(int category, PagingVO pagingVO, String sorting, String min_amount, String max_amount,
			List<String> positions, List<String> colors_list, List<String> brands);
	
	/* ��ǰ ��ȸ */
	public GoodsVO getGoodsInfo(Long goods_num);
	
	
	
	
	
	
	/* ��ǰ QNA ��� */
	public void insertGoodsQna(GoodsQnaVO qna);
	
	/* ��ǰ QNA ��� */
	public List<GoodsQnaVO> getQnaList(PagingVO pagingVO, long goods_num);


	

	
	
	/* user_key�� �̿��� moredetail�� �����´�.*/
	public MoreDetailsVO findDetail(long user_key);
	
	/* ��õ��ǰ - ȸ�� */
	public List<GoodsVO> recommendGoodsList(MoreDetailsVO moredetail); 
	
	/* ��õ��ǰ - ��ȸ�� */
	public List<GoodsVO> recommendBestList();

	// 장바구니 목록에 상품 넣는 메소드
	public void addGoodsToCart(GoodsVO goods, int qty, long user_key);

	
}
