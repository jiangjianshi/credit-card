namespace java com.br.creditcard.api.dto


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

// 返回结果DTO
struct ApiDto {
    1: int code,
    2: string message,
    3: string data
}