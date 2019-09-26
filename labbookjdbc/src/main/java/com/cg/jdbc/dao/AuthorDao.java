package com.cg.jdbc.dao;

import java.math.BigInteger;
import java.util.List;

import com.cg.jdbc.dto.Author;
import com.cg.jdbc.exception.JDBCException;


public interface AuthorDao {
	public Author addAuthor(Author author) throws JDBCException;
	public Author deleteAuthor(BigInteger author);
	public Author searchAuthor(BigInteger authorId);
	public List<Author> getAuthors();

}
