SELECT * FROM case_md4.category;

INSERT INTO `case_md4`.`category` (`id_category`, `name_category`) VALUES ('1', 'Dresses');
INSERT INTO `case_md4`.`category` (`id_category`, `name_category`) VALUES ('2', 'Shirts');
INSERT INTO `case_md4`.`category` (`id_category`, `name_category`) VALUES ('3', 'Jeans');
INSERT INTO `case_md4`.`category` (`id_category`, `name_category`) VALUES ('4', 'Swimwear');
INSERT INTO `case_md4`.`category` (`id_category`, `name_category`) VALUES ('5', 'Sleepwear');
INSERT INTO `case_md4`.`category` (`id_category`, `name_category`) VALUES ('6', 'Sportswear');
INSERT INTO `case_md4`.`category` (`id_category`, `name_category`) VALUES ('7', 'Jumpsuits');
INSERT INTO `case_md4`.`category` (`id_category`, `name_category`) VALUES ('8', 'Blazers');
INSERT INTO `case_md4`.`category` (`id_category`, `name_category`) VALUES ('9', 'Jackets');
INSERT INTO `case_md4`.`category` (`id_category`, `name_category`) VALUES ('10', 'Shoes');

INSERT INTO `case_md4`.`color` (`id_color`, `name_color`) VALUES ('1', 'black');
INSERT INTO `case_md4`.`color` (`id_color`, `name_color`) VALUES ('2', 'White');
INSERT INTO `case_md4`.`color` (`id_color`, `name_color`) VALUES ('3', 'Red');
INSERT INTO `case_md4`.`color` (`id_color`, `name_color`) VALUES ('4', 'Blue');
INSERT INTO `case_md4`.`color` (`id_color`, `name_color`) VALUES ('5', 'Green');

INSERT INTO `case_md4`.`size` (`id_size`, `name_size`) VALUES ('1', 'XS');
INSERT INTO `case_md4`.`size` (`id_size`, `name_size`) VALUES ('2', 'S');
INSERT INTO `case_md4`.`size` (`id_size`, `name_size`) VALUES ('3', 'M');
INSERT INTO `case_md4`.`size` (`id_size`, `name_size`) VALUES ('4', 'L');
INSERT INTO `case_md4`.`size` (`id_size`, `name_size`) VALUES ('5', 'XL');

ALTER TABLE `case_md4`.`product` 
CHANGE COLUMN `content` `content` VARCHAR(2000) NULL DEFAULT NULL ;


INSERT INTO `case_md4`.`product` (`id_product`, `content`, `description`, `img`, `name_product`, `price`, `quantity`, `category_id_category`, `color_id_color`, `size_id_size`) VALUES ('1', 'Đầm voan trơn, thiết kế áo kiểu sơ mi, phía trước may 2 lớp xếp ly tạo điểm nhấn, tay lửng bo nhẹ. Tùng váy xòe với độ dài ngang bắp chân giúp che được hết những khuyết điểm của cô nàng mảnh khảnh và mang đến sự thanh lịch, thướt tha mà không kém phần quyến rũ cho phái đẹp.', 'Đầm xếp, tay ngắn, cổ Đức, họa tiết trơn,chất liệu voan', 'dam_dap_ly.jpg', 'ĐẦM VOAN DẬP LY', '413.000', '50', '1', '3', '2');
INSERT INTO `case_md4`.`product` (`id_product`, `content`, `description`, `img`, `name_product`, `price`, `quantity`, `category_id_category`, `color_id_color`, `size_id_size`) VALUES ('2', 'Áo sơ mi cổ may viền cách điệu. Tay lửng bo gấu, phần vai xếp ly nhún phồng. Dáng áo suông, chất liểu vải lụa mềm nhẹ.', 'Cổ đức, tay ngắn, kiểu dáng xuông,họa tiết trơn, chất liệu lụa', 'so_mi_lua.jpg', 'ÁO SƠ MI LỤA', '210.000', '10', '2', '2', '1');
INSERT INTO `case_md4`.`product` (`id_product`, `content`, `description`, `img`, `name_product`, `price`, `quantity`, `category_id_category`, `color_id_color`, `size_id_size`) VALUES ('3', 'Thiết kế quần jeans ống suông đang là hot trend cho mùa hè này bởi sự thoải mái, che khuyết điểm tốt và \"ăn gian\" chiều cao cho các nàng. Mẫu quần phù hợp đi học, đi chơi hoặc khi nàng mix cùng áo sơ mi sẽ được 1 outfit công sở thanh lịch, trẻ trung.', 'Quần jeans ống rộng, dáng suông. Phía trước có khuy cài và khóa kéo, phía sau có túi hộp. Cạp cao, chiều dài đến mắt cá chân.', 'jeans_ong_suong.jpg', 'QUẦN JEANS ỐNG SUÔNG', '693.000', '14', '3', '4', '3');
INSERT INTO `case_md4`.`product` (`id_product`, `content`, `description`, `img`, `name_product`, `price`, `quantity`, `category_id_category`, `color_id_color`, `size_id_size`) VALUES ('4', 'Áo bơi bikini cổ ngang. Có hai dây ráp bèo ống tay 2 bên. Quần bikini cạp cao, 2 dây đan bên hông. Vải họa tiết ', 'Đồ bơi kiểu dáng 2 mảnh, họa tiết ', 'do_boi.jpg', 'BỘ ĐỒ BƠI HAI MẢNH HỌA TIẾT ', '763.000', '6', '4', '1', '4');
INSERT INTO `case_md4`.`product` (`id_product`, `content`, `description`, `img`, `name_product`, `price`, `quantity`, `category_id_category`, `color_id_color`, `size_id_size`) VALUES ('5', 'Một bộ đồ mặc nhà thoải mái sẽ giúp quãng thời gian nghỉ ngơi của bạn dễ chịu hơn rất nhiều. Chất liệu lụa trơn mịn mang đến xúc cảm không thể từ chối. Dáng quần ngắn cùng dáng áo 2 dây giúp bạn cảm thấy thoải mái và mát mẻ khi đi ngủ. Đặc biệt, quần có cạp chun và dây buộc nên bạn có thể tùy chính theo số đo của bản thân.', 'Bộ đồ lụa bao gồm áo hai dây và quần ngắn. Áo cổ V, phía trước có khuy trang trí, viền áo được nhấn bèo. Quần ngắn nga đùi, cạp chun, có dây buộc để điều chỉnh.', 'do_ngu.jpg', 'BỘ ĐỒ NGỦ LỤA NGẮN', '728.000', '20', '5', '5', '5');

INSERT INTO `case_md4`.`product` (`id_product`, `content`, `description`, `img`, `name_product`, `price`, `quantity`, `category_id_category`, `color_id_color`, `size_id_size`) VALUES ('6', 'Được tạo nên từ chất liệu vải lưới kết hợp da lộn bề mặt nhám. Lớp lót đế rất dày dặn với nhiều lỗ thông khí giúp chân con thông thoáng tối đa, không gây hầm bí chân khi mang cả ngày dài. Đế giày siêu nhẹ, độ bám chống trơn trượt tốt , dễ dàng uốn cong nên hỗ trợ vận động rất tốt. Cho bé cảm giác tự tin, thoải mái trên từng bước đi. Thích hợp cho con diện đồ thời trang đi chơi, đi du lịch, đi học hay chạy bộ, các hoạt động thể thao...', 'Giày thể thao cho bé trai được phối màu cá tính thích hợp cho con diện nhiều kiểu quần áo thời trang khác nhau theo phong cách năng động, khỏe khoắn.', 'giay_the_thao.jpg', 'GIÀY THỂ THAO PHỐI DA LỘN', '638.000', '12', '6', '2', '4');
INSERT INTO `case_md4`.`product` (`id_product`, `content`, `description`, `img`, `name_product`, `price`, `quantity`, `category_id_category`, `color_id_color`, `size_id_size`) VALUES ('7', 'Áo liền quần chất liệu Denim cho bé gái. Yếm thiết kế túi liền hai dây, 2 túi có nắp 2 bên. Chất liệu denim co dãn nhẹ, sự dày dặn của chất liệu này giúp các sản phẩm làm từ vải denim luôn bền bỉ theo thời gian.', 'Áo liền quần cổ khoác', 'ao_lien_quan.jpg', 'ÁO LIỀN QUẦN DÁNG YẾM', '540.000', '6', '7', '2', '1');
INSERT INTO `case_md4`.`product` (`id_product`, `content`, `description`, `img`, `name_product`, `price`, `quantity`, `category_id_category`, `color_id_color`, `size_id_size`) VALUES ('8', 'Tiêu chuẩn Green to Wear 2.0 nhằm mục đích giảm thiểu tác động của quá trình sản xuất hàng dệt may tới môi trường. Để thực hiện được mục tiêu này, chúng tôi đã xây dựng chương trình The List của Inditex, theo đó giúp chúng tôi đảm bảo các quy trình sản xuất sạch cũng như độ an toàn và tính lành mạnh của các sản phẩm may mặc của mình.', 'Áo khoác blazer dáng suông, cổ ve lật, dài tay. Có hai túi may viền phía trước. Bên trong lót vải cùng màu. Cài khuy phía trước.', 'ao_blazer.jpg', 'ÁO KHOÁC BLAZER DÁNG SUÔNG', '990.000', '8', '8', '2', '3');
