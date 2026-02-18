private RecyclerView recyclerView;
private MovieAdapter adapter;
private ArrayList<Movie> movieLines;
private boolean isGridView = false;
movieLines.add(new Movie("Inception", "A thief who steals corporate secrets...", R.drawable.inception));
movieLines.add(new Movie("The Dark Knight", "When the menace known as the Joker...", R.drawable.dark_knight));
btnToggle.setOnClickListener(v -> {
    isGridView = !isGridView;
    updateLayoutManager();
    saveLayoutState(isGridView);
});
private void saveLayoutState(boolean isGrid) {
    SharedPreferences sharedPreferences = getSharedPreferences("Settings", MODE_PRIVATE);
    SharedPreferences.Editor editor = sharedPreferences.edit();
    editor.putBoolean("isGrid", isGrid);
    editor.apply();
}

Intent intent = new Intent(MainActivity.this, DetailsActivity.class);
intent.putExtra("movie_data", selectedMovie);
startActivity(intent);