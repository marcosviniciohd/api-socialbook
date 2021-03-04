package com.marcosviniciohd.socialbooks.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marcosviniciohd.socialbooks.domain.Livro;

public interface LivrosRepository extends JpaRepository<Livro, Long> {
	
	

}
