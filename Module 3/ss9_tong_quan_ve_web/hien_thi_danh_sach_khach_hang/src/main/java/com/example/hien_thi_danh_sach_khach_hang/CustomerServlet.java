package com.example.hien_thi_danh_sach_khach_hang;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "CustomerServlet", value = "/customer")
public class CustomerServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Customer> customerList = new ArrayList<>();
        customerList.add(new Customer("Mai Văn Hoàng", "1983-08-20", "Hà Nội", "https://www.google.com/url?sa=i&url=https%3A%2F%2Flaodong.vn%2Fvan-hoa-giai-tri%2Ftop-15-nam-dien-vien-han-dep-nhat-kim-seon-ho-dinh-be-boi-van-dung-top-1-1020690.ldo&psig=AOvVaw3DchZGjy9t_fzuONxRu7R4&ust=1732714503389000&source=images&cd=vfe&opi=89978449&ved=0CBQQjRxqFwoTCNDDtNeO-okDFQAAAAAdAAAAABAK"));
        customerList.add(new Customer("Nguyễn Văn Nam", "1983-08-21", "Bắc Giang","https://www.google.com/url?sa=i&url=http%3A%2F%2Fvanhoanghethuat.vn%2Fnhung-nam-dien-vien-trien-vong-cua-dien-anh-han-quoc-2023.htm&psig=AOvVaw3DchZGjy9t_fzuONxRu7R4&ust=1732714503389000&source=images&cd=vfe&opi=89978449&ved=0CBQQjRxqFwoTCNDDtNeO-okDFQAAAAAdAAAAABAP" ));
        customerList.add(new Customer("Nguyễn Thái Hòa", "1983-08-22", "Nam Định", "https://www.google.com/url?sa=i&url=https%3A%2F%2Flaodong.vn%2Fvan-hoa-giai-tri%2Ftop-15-nam-dien-vien-han-dep-nhat-kim-seon-ho-dinh-be-boi-van-dung-top-1-1020690.ldo&psig=AOvVaw3DchZGjy9t_fzuONxRu7R4&ust=1732714503389000&source=images&cd=vfe&opi=89978449&ved=0CBQQjRxqFwoTCNDDtNeO-okDFQAAAAAdAAAAABAX"));
        customerList.add(new Customer("Trần Đăng Khoa", "1983-08-17", "Hà Tây", "https://www.google.com/url?sa=i&url=https%3A%2F%2Fbaophapluat.vn%2Fchan-dung-nhung-nam-dien-vien-dang-noi-tieng-cua-han-quoc-post401106.html&psig=AOvVaw3DchZGjy9t_fzuONxRu7R4&ust=1732714503389000&source=images&cd=vfe&opi=89978449&ved=0CBQQjRxqFwoTCNDDtNeO-okDFQAAAAAdAAAAABAf" ));
        customerList.add(new Customer("Nguyễn Đình Thi", "1983-08-19", "Hà Nội", "https://www.google.com/url?sa=i&url=https%3A%2F%2Fgiadinh.suckhoedoisong.vn%2F10-tai-tu-dep-trai-nhat-han-quoc-172211229141026471.htm&psig=AOvVaw3DchZGjy9t_fzuONxRu7R4&ust=1732714503389000&source=images&cd=vfe&opi=89978449&ved=0CBQQjRxqFwoTCNDDtNeO-okDFQAAAAAdAAAAABAn"));

        req.setAttribute("customerListServlet", customerList);
        req.getRequestDispatcher("customerList.jsp").forward(req,resp);
    }
}