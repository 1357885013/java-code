package newsSystem;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.Properties;

public class newsManage {
    private Connection con;

    public newsManage() throws ClassNotFoundException, IOException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Properties pro = new Properties();
        pro.load(new FileInputStream("./newsSystem/db.properties"));
        con = DriverManager.getConnection("JDBC:Mysql://localhost:3306/news", pro);
    }

    public ArrayList<Res> query(String title) {
        PreparedStatement state = null;
        ResultSet res = null;
        ArrayList<Res> news = new ArrayList<>();
        try {
            state = con.prepareStatement("select id,title from new where title=?");
            state.setString(1, title);
            res = state.executeQuery();
            while (res.next()) {
                news.add(new Res(res.getInt(1), res.getString(2)));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (res != null) {
                    res.close();
                }
                if (state != null) {
                    state.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return news;
    }

    public New query(int id) {
        PreparedStatement state = null;
        ResultSet res = null;
        New news = null;
        try {
            state = con.prepareStatement("select * from new where id=?");
            state.setInt(1, id);
            res = state.executeQuery();
            while (res.next()) {
                news = new New(res.getString(2), res.getString(3), res.getString(4), res.getTimestamp(5));
                news.setId(id);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (res != null) {
                    res.close();
                }
                if (state != null) {
                    state.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return news;
    }

    public int add(New news) {
        PreparedStatement state = null;
        int res = 0;
        try {
            state = con.prepareStatement("insert into new values(null,?,?,?,?)");
            state.setString(1, news.getTitle());
            state.setString(2, news.getContent());
            state.setString(3, news.getAuthur());
            state.setDate(4, new java.sql.Date(news.getTime().getTime()));
            state.setTime(4, new java.sql.Time(news.getTime().getTime()));
            state.setTimestamp(4, new java.sql.Timestamp(news.getTime().getTime()));

            res = state.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (state != null) {
                try {
                    state.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return res;
    }

    public int delete(String title) {
        PreparedStatement state = null;
        int res = 0;
        try {
            state = con.prepareStatement("delete from new where title=?");
            state.setString(1, title);

            res = state.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (state != null) {
                try {
                    state.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return res;
    }

    public int delete(int id) {
        PreparedStatement state = null;
        int res = 0;
        try {
            state = con.prepareStatement("delete from new where id=?");
            state.setInt(1, id);

            res = state.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (state != null) {
                try {
                    state.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return res;
    }

    public int update(New news) {
        PreparedStatement state = null;
        int res = 0;
        try {
            state = con.prepareStatement("update new set title=?,content=?,authu=?,time=? where id=" + news.getId());
            state.setString(1, news.getTitle());
            state.setString(2, news.getContent());
            state.setString(3, news.getAuthur());
            state.setDate(4, new java.sql.Date(news.getTime().getTime()));

            res = state.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (state != null) {
                try {
                    state.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return res;
    }

    public ArrayList<Res> listTitle() {
        PreparedStatement state = null;
        ResultSet res = null;
        ArrayList<Res> titles = new ArrayList<>();
        try {
            state = con.prepareStatement("select id,title from new");
            res = state.executeQuery();
            while (res.next()) {
                titles.add(new Res(res.getInt(1), res.getString(2)));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (res != null) {
                    res.close();
                }
                if (state != null) {
                    state.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return titles;
    }

    @Override
    protected void finalize() throws Throwable {
        con.close();
        super.finalize();
    }

    class Res {
        int id;
        String title;

        public Res(int id, String title) {
            this.id = id;
            this.title = title;
        }

        @Override
        public String toString() {
            return id + "  " + title + "\n";
        }
    }
}
