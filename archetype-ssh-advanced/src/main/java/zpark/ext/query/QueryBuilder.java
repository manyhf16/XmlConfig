package zpark.ext.query;

import java.util.List;

public interface QueryBuilder {

	public void build(StringBuilder sb, List<Object> params);

}
