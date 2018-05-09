namespace java com.br.card.api.dto


typedef i16 short
typedef i32 int
typedef i64 long

// 调用是否成功DTO
struct BoolDTO {
    1: bool success,
    2: int code,
    3: string message,
    4: bool value
}

// 调用是否成功DTO
struct StringDTO {
    1: bool success,
    2: int code,
    3: string message,
    4: string value
}

struct ResultDTO{
	1:bool success,
	2:int code,
	3:string message,
	4:int resultListTotal,
	5:list<map<string, string>> resultList,
	6:int waitReceviceTotal
}
struct ResultMapDTO{
	1:bool success,
	2:int code,
	3:string message,
	4:int resultListTotal,
	5:map<string, string> resultMap
}

