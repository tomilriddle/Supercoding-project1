package com.example.project01.repository.ReplyRepository;

import com.example.project01.Entity.ReplyEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReplyRepository extends JpaRepository<ReplyEntity, Long> {

   //  public List<ReplyEntity>  findAllByPost_id(long postId);
     public List<ReplyEntity>  findAllBy();
}
