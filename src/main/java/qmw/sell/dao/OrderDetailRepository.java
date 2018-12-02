package qmw.sell.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import qmw.sell.dataobject.OrderDetail;

import java.util.List;

public interface OrderDetailRepository extends JpaRepository<OrderDetail,String> {

    List<OrderDetail> findByOrderId(String orderId);
}
