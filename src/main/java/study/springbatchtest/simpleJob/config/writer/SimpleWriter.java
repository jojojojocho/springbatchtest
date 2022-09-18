package study.springbatchtest.simpleJob.config.writer;

import lombok.AllArgsConstructor;
import org.springframework.batch.item.ItemWriter;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

@AllArgsConstructor
public class SimpleWriter implements ItemWriter<String> {

    private JdbcTemplate jdbcTemplate;

    @Override
    public void write(List items) throws Exception {
//        String sql = "insert into team(ID,NAME) values(?,?)";
//
//        jdbcTemplate.batchUpdate(sql, new BatchPreparedStatementSetter() {
//            @Override
//            public void setValues(PreparedStatement ps, int i) throws SQLException {
//                ps.setLong(1, 4);
//                ps.setString(2, "team2");
//            }
//
//            @Override
//            public int getBatchSize() {
//                return items.size();
//            }
//        });
    }
}
