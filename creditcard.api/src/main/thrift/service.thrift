namespace java com.br.card.api.service

include "dto.thrift"

typedef i16 short
typedef i32 int
typedef i64 long

service ActivityHelpMappingHandler {

    dto.BoolDTO applyHelpUserMapping(1:int tid, 2:map<string, string> paramMap),

    dto.ResultMapDTO getHelperList(1:int tid, 2:map<string, string> paramMap)
}



