package com.ada.ci.api_rest_forum.repositories;

import com.ada.ci.api_rest_forum.models.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<Message, Long> {
}
