namespace java com.br.creditcard.api.service

include "dto.thrift"

typedef i16 short
typedef i32 int
typedef i64 long

service TestHandler {


    dto.ApiDto testHandler(1:int tid, 2:map<string, string> paramMap)
}



