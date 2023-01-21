//package com.jpa.spingboot.domain.post;
//
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit.jupiter.SpringExtension;
//
//import java.time.LocalDateTime;
//import java.util.List;
//
//import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
//
//@ExtendWith(SpringExtension.class)
//@SpringBootTest
//public class PostRepositoryTest {
//
//    @Autowired
//    PostRepository postRepository;
//
//    @AfterEach
//    public void cleanup() {
//        postRepository.deleteAll();
//    }
//
////    @Test
////    public void findAllPost() {
////        //given
////        String title = "test";
////        String content = "test_content";
////
////        postRepository.save(Posts.builder()
////                .title(title)
////                .content(content)
////                .author("gijoongjang")
////                .build());
////
////        //when
////        List<Posts> postList = postRepository.findAll();
////
////        //then
////        Posts post = postList.get(0);
////        assertThat(post.getTitle()).isEqualTo(title);
////        assertThat(post.getContent()).isEqualTo(content);
////    }
//    @Test
//    public void BaseTimeEntityCreate() {
//        //given
//        LocalDateTime now = LocalDateTime.of(2022, 7, 9, 4, 52, 0);
//        postRepository.save(Posts.builder()
//                .title("test1")
//                .content("test1")
//                .author("gijoongjang")
//                .build());
//
//        //when
//        List<Posts> allPost = postRepository.findAll();
//
//        //then
//        Posts post =  allPost.get(0);
//
//        System.out.println("createdDate= " + post.getCreatedDate() + ", modifiedDate= " + post.getModifiedDate());
//
//        assertThat(post.getCreatedDate()).isAfter(now);
//        assertThat(post.getModifiedDate().isAfter(now));
//    }
//}
