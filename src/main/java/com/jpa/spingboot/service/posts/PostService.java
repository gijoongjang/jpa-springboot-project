package com.jpa.spingboot.service.posts;

import com.jpa.spingboot.domain.post.PostRepository;
import com.jpa.spingboot.domain.post.Posts;
import com.jpa.spingboot.dto.PostListResponseDto;
import com.jpa.spingboot.dto.PostResponseDto;
import com.jpa.spingboot.dto.PostSaveRequestDto;
import com.jpa.spingboot.dto.PostUpdateRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class PostService {

    //Autowired가 아닌 생성자로 주입받는다.
    private final PostRepository postRepository;

    @Transactional
    public Long save(PostSaveRequestDto requestDto) {
        return postRepository.save(requestDto.toEntity()).getId();
    }

    @Transactional
    public Long update(Long id, PostUpdateRequestDto requestDto) {
        Posts posts = postRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("해당 게시글이 없습니다. id=" + id));

        posts.update(requestDto.getTitle(), requestDto.getContent());   //더티 체킹(dirty checking)

        return id;
    }

    public PostResponseDto findById(Long id) {
        Posts entity = postRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("해당 게시글이 없습니다. id=" + id));

        return new PostResponseDto(entity);
    }

    public List<PostListResponseDto> findAll() {
        return postRepository.findAllByOrderByIdDesc().stream()
                .map(PostListResponseDto::new)
                .collect(Collectors.toList());
    }

    @Transactional
    public void delete(Long id) {
        Posts post = postRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("해당 게시글이 없습니다. id="+id));

        postRepository.delete(post);
    }
}
