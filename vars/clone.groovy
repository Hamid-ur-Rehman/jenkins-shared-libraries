def call(string url, stromg nramcj)
{
      echo 'Cloning the repository...'
      git url: "${url}", branch: "${branch}"
      echo 'Code cloning successful'
}
