// Valid: Compiler infers from the 'names' variable
List<String> names = new ArrayList<>();

// Invalid: The compiler has no target type to infer from
// new ArrayList<>(); 
// This would result in a compile-time error.