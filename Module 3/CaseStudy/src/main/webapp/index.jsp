<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="vi">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Thư viện Truyện tranh</title>
    <link rel="stylesheet" href="index-style.css">
</head>
<body>
<header>
    <h1>Thư viện</h1>
</header>
<main>
    <div class="comic-container">
        <div class="comic-card">
            <img src="webapp/image/To-kill-a-mockingbird.jpg" alt="To Kill a Mockingbird" class="comic-cover">
            <div class="comic-info">
                <h2 class="comic-title">To Kill a Mockingbird</h2>
                <p class="comic-summary">
                    To Kill a Mockingbird kể về Atticus Finch, một luật sư ở miền Nam nước Mỹ, bảo vệ Tom Robinson, một người da đen bị buộc tội hiếp dâm một phụ nữ da trắng. Câu chuyện được kể qua góc nhìn của con gái ông, Scout, khi cô chứng kiến sự bất công và phân biệt chủng tộc trong xã hội.
                </p>
                <div class="comic-tags">
                    <span class="tag">Hành động</span>
                    <span class="tag">Phiêu lưu</span>
                    <span class="tag">Hài hước</span>
                </div>
                <button class="borrow-btn">Mượn Sách</button>
            </div>
        </div>
        <!-- Truyện 2 -->
        <div class="comic-card">
            <img src="naruto.jpg" alt="1984" class="comic-cover">
            <div class="comic-info">
                <h2 class="comic-title">1984</h2>
                <p class="comic-summary">
                    1984 của George Orwell là câu chuyện về Winston Smith, một người sống dưới chế độ toàn trị của Đảng và lãnh tụ Big Brother, nơi sự thật bị bóp méo và tự do bị đàn áp. Winston cố gắng nổi dậy chống lại hệ thống, nhưng cuối cùng bị bắt và "tẩy não".
                </p>
                <br>
                <div class="comic-tags">
                    <span class="tag">Hành động</span>
                    <span class="tag">Phiêu lưu</span>
                    <span class="tag">Drama</span>
                </div>
                <button class="borrow-btn">Mượn Sách</button>
            </div>
        </div>
        <!-- Truyện 3 -->
        <div class="comic-card">
            <img src="attackontitan.jpg" alt="Pride and Prejudice" class="comic-cover">
            <div class="comic-info">
                <h2 class="comic-title">Pride and Prejudice</h2>
                <p class="comic-summary">
                    Pride and Prejudice của Jane Austen kể về Elizabeth Bennet, một cô gái thông minh, vượt qua định kiến và hiểu lầm để tìm thấy tình yêu đích thực với Mr. Darcy.
                </p>
                <br>
                <br>
                <br>
                <div class="comic-tags">
                    <span class="tag">Hành động</span>
                    <span class="tag">Kinh dị</span>
                    <span class="tag">Drama</span>
                </div>
                <button class="borrow-btn">Mượn Sách</button>
            </div>
        </div>
        <!-- Truyện 4 -->
        <div class="comic-card">
            <img src="doraemon.jpg" alt="The Great Gatsby" class="comic-cover">
            <div class="comic-info">
                <h2 class="comic-title">The Great Gatsby</h2>
                <p class="comic-summary">
                    The Great Gatsby của F. Scott Fitzgerald kể về Jay Gatsby, một triệu phú bí ẩn, khao khát tái hợp với tình yêu cũ, Daisy Buchanan. Qua góc nhìn của Nick Carraway, tác phẩm khám phá sự phù phiếm của "Giấc mơ Mỹ" và nỗi trống rỗng trong xã hội thượng lưu.
                </p>
                <div class="comic-tags">
                    <span class="tag">Hài hước</span>
                    <span class="tag">Phiêu lưu</span>
                    <span class="tag">Gia đình</span>
                </div>
                <button class="borrow-btn">Mượn Sách</button>
            </div>
        </div>
        <!-- Truyện 5 -->
        <div class="comic-card">
            <img src="dragonball.jpg" alt="Moby Dick" class="comic-cover">
            <div class="comic-info">
                <h2 class="comic-title">Moby Dick</h2>
                <p class="comic-summary">
                    Moby Dick của Herman Melville kể về thuyền trưởng Ahab, người ám ảnh săn đuổi con cá voi trắng khổng lồ Moby Dick để trả thù. Qua góc nhìn của thuỷ thủ Ishmael, câu chuyện khám phá sự ám ảnh, trả giá và mối quan hệ giữa con người và thiên nhiên.
                </p>
                <div class="comic-tags">
                    <span class="tag">Hành động</span>
                    <span class="tag">Phiêu lưu</span>
                    <span class="tag">Hài hước</span>
                </div>
                <button class="borrow-btn">Mượn Sách</button>
            </div>
        </div>
    </div>
</main>
<a href="customer">Hiển thị danh sách khách hàng</a>
</body>
</html>
